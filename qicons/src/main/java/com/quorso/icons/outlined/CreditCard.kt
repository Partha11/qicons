package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) {
            return _CreditCard!!
        }
        _CreditCard = ImageVector.Builder(
            name = "Outlined.CreditCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.25f, 8.25f)
                horizontalLineToRelative(19.5f)
                moveTo(2.25f, 9f)
                horizontalLineToRelative(19.5f)
                moveToRelative(-16.5f, 5.25f)
                horizontalLineToRelative(6f)
                moveToRelative(-6f, 2.25f)
                horizontalLineToRelative(3f)
                moveToRelative(-3.75f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineTo(6.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 4.5f)
                horizontalLineToRelative(-15f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(10.5f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 19.5f)
                close()
            }
        }.build()

        return _CreditCard!!
    }

@Suppress("ObjectPropertyName")
private var _CreditCard: ImageVector? = null
