package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.DocumentCurrencyYen: ImageVector
    get() {
        if (_DocumentCurrencyYen != null) {
            return _DocumentCurrencyYen!!
        }
        _DocumentCurrencyYen = ImageVector.Builder(
            name = "Outlined.DocumentCurrencyYen",
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
                moveTo(19.5f, 14.25f)
                verticalLineToRelative(-2.625f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.375f, -3.375f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 7.125f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.375f, -3.375f)
                horizontalLineTo(8.25f)
                moveToRelative(1.5f, 9f)
                lineToRelative(2.25f, 3f)
                moveToRelative(0f, 0f)
                lineToRelative(2.25f, -3f)
                moveToRelative(-2.25f, 3f)
                verticalLineToRelative(4.5f)
                moveTo(9.75f, 15f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-4.5f, 2.25f)
                horizontalLineToRelative(4.5f)
                moveToRelative(-3.75f, -15f)
                horizontalLineTo(5.625f)
                curveToRelative(-0.621f, 0f, -1.125f, 0.504f, -1.125f, 1.125f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 0.621f, 0.504f, 1.125f, 1.125f, 1.125f)
                horizontalLineToRelative(12.75f)
                curveToRelative(0.621f, 0f, 1.125f, -0.504f, 1.125f, -1.125f)
                verticalLineTo(11.25f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                close()
            }
        }.build()

        return _DocumentCurrencyYen!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCurrencyYen: ImageVector? = null
