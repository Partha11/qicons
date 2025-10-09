package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Calculator: ImageVector
    get() {
        if (_Calculator != null) {
            return _Calculator!!
        }
        _Calculator = ImageVector.Builder(
            name = "Outlined.Calculator",
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
                moveTo(15.75f, 15.75f)
                lineTo(15.75f, 18f)
                moveToRelative(-7.5f, -6.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(8.25f, 11.258f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(8.25f, 13.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(8.25f, 13.508f)
                lineTo(8.25f, 13.5f)
                close()
                moveTo(8.25f, 15.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(8.25f, 15.758f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(8.25f, 18f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(8.25f, 18.008f)
                lineTo(8.25f, 18f)
                close()
                moveTo(10.748f, 11.25f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(10.748f, 13.5f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                lineTo(10.748f, 13.5f)
                close()
                moveTo(10.748f, 15.75f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(10.748f, 18f)
                horizontalLineToRelative(0.007f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.007f)
                lineTo(10.748f, 18f)
                close()
                moveTo(13.252f, 11.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(13.252f, 13.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                lineTo(13.252f, 13.5f)
                close()
                moveTo(13.252f, 15.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(13.252f, 18f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                lineTo(13.252f, 18f)
                close()
                moveTo(15.75f, 11.25f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(15.75f, 13.5f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                lineTo(15.75f, 13.5f)
                close()
                moveTo(8.25f, 6f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(-7.5f)
                lineTo(8.25f, 6f)
                close()
                moveTo(12f, 2.25f)
                curveToRelative(-1.892f, 0f, -3.758f, 0.11f, -5.593f, 0.322f)
                curveTo(5.307f, 2.7f, 4.5f, 3.65f, 4.5f, 4.757f)
                lineTo(4.5f, 19.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                lineTo(19.5f, 4.757f)
                curveToRelative(0f, -1.108f, -0.806f, -2.057f, -1.907f, -2.185f)
                arcTo(48.507f, 48.507f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2.25f)
                close()
            }
        }.build()

        return _Calculator!!
    }

@Suppress("ObjectPropertyName")
private var _Calculator: ImageVector? = null
