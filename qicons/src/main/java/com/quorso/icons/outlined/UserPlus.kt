package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) {
            return _UserPlus!!
        }
        _UserPlus = ImageVector.Builder(
            name = "Outlined.UserPlus",
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
                moveTo(18f, 7.5f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3f)
                moveToRelative(0f, -3f)
                horizontalLineToRelative(3f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(-3f)
                moveToRelative(-2.25f, -4.125f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6.75f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 0f)
                close()
                moveTo(3f, 19.235f)
                verticalLineToRelative(-0.11f)
                arcToRelative(6.375f, 6.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.75f, 0f)
                verticalLineToRelative(0.109f)
                arcTo(12.318f, 12.318f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.374f, 21f)
                curveToRelative(-2.331f, 0f, -4.512f, -0.645f, -6.374f, -1.766f)
                close()
            }
        }.build()

        return _UserPlus!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlus: ImageVector? = null
