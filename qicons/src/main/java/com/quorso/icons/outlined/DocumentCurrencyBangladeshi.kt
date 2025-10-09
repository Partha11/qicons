package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.DocumentCurrencyBangladeshi: ImageVector
    get() {
        if (_DocumentCurrencyBangladeshi != null) {
            return _DocumentCurrencyBangladeshi!!
        }
        _DocumentCurrencyBangladeshi = ImageVector.Builder(
            name = "Outlined.DocumentCurrencyBangladeshi",
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
                moveToRelative(0f, 8.25f)
                lineToRelative(0.22f, -0.22f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.28f, 0.53f)
                verticalLineToRelative(6.441f)
                curveToRelative(0f, 0.472f, 0.214f, 0.934f, 0.64f, 1.137f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.994f, -1.77f)
                curveToRelative(0.205f, -0.428f, -0.152f, -0.868f, -0.627f, -0.868f)
                horizontalLineToRelative(-0.507f)
                moveToRelative(-6f, -2.25f)
                horizontalLineToRelative(7.5f)
                moveTo(10.5f, 2.25f)
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

        return _DocumentCurrencyBangladeshi!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCurrencyBangladeshi: ImageVector? = null
