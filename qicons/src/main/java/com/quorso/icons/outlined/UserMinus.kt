package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.UserMinus: ImageVector
    get() {
        if (_UserMinus != null) {
            return _UserMinus!!
        }
        _UserMinus = ImageVector.Builder(
            name = "Outlined.UserMinus",
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
                moveTo(22f, 10.5f)
                horizontalLineToRelative(-6f)
                moveToRelative(-2.25f, -4.125f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.75f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 0f)
                close()
                moveTo(4f, 19.235f)
                verticalLineToRelative(-0.11f)
                arcToRelative(6.375f, 6.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.75f, 0f)
                verticalLineToRelative(0.109f)
                arcTo(12.318f, 12.318f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.374f, 21f)
                curveToRelative(-2.331f, 0f, -4.512f, -0.645f, -6.374f, -1.766f)
                close()
            }
        }.build()

        return _UserMinus!!
    }

@Suppress("ObjectPropertyName")
private var _UserMinus: ImageVector? = null
